package tutorial

/**
  * Created by marcin on 7/17/17.
  */
class Scala101 {
  def helloWorld(name: String) = {
    println(s"Hello World, $name")
  }

  def scalaForLoop = {
    var a = 0

    // for loop execution with a range
    for( a <- 1 to 10){
      println( "Value of a: " + a )
    }
  }
}


class Machine {
  var id = ""
  var power = 0

}

class MetalRobot(robot_id: String, robot_power: Int) extends Machine {
  id = robot_id
  power = robot_power

  def show_robot_id: String = {
    id
  }

}