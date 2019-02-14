package utest

import cs.algorithms.ClosestValue

object ClosestValueTest extends TestSuite {
  override def tests: Tests = Tests {
    'test1 - {
      assert(ClosestValue.findClosest(5, Array(1,2,3,4,5)) == 5)
    }
    'test2 - {
      assert(ClosestValue.findClosest(10, Array(1,2,3,4,5,6,100)) == 6)
    }
    'test3 - {
      assert(ClosestValue.findClosest(50, Array(1,2,3,4,5,6,100)) == 6)
    }
    'test4 - {
      assert(ClosestValue.findClosest(70, Array(1,2,3,4,5,6,100)) == 100)
    }
    'test5 - {
      assert(ClosestValue.findClosest(-4, Array(1,2,3,4,5,6,100)) == 1)
    }
    'test6 - {
      assert(ClosestValue.findClosest(-4, Array(-10,-6,-4,1,2,3,4,5,6,100)) == -4)
    }
    'test7 - {
      assert(ClosestValue.findClosest(0, Array(-10,-6,-4,1,2,3,4,5,6,100)) == 1)
    }
  }
}
