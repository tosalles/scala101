def action1() = {
  println("action1")
  "action1"
}

def action2() = {
  println("action2")
  "action2"
}

def doItOrNotStrict(cond: Boolean, doIt: String, dont: String):String =
  if (cond) doIt else dont

def doItOrNotNonStrict(cond: Boolean, doIt: () => String, dont: () => String) =
  if (cond) doIt() else dont()

// action1 and action2 are shown in the console and action1 is returned as result
doItOrNotStrict(true, action1(), action2())

// only action1 is shown in the console and action1 is also returned as result
doItOrNotNonStrict(true, action1, action2)