package net.matthewgamble.hr

import org.jline.terminal.TerminalBuilder

/**
 * @author ${user.name}
 */
object MainClass {
  def main(args: Array[String]): Unit = {
    var width = 80
    try {
      val terminal = TerminalBuilder.terminal()
      width = terminal.getWidth()
    } catch {
      case e: Throwable => 
        width = 80
    }

    var lines = 1
    if (args.length > 0) {
      try {
        lines = args(0).toInt
      } catch {
        case e: NumberFormatException =>
          lines = 1
      }
    }

    val outcharBuilder = new StringBuilder(width)
    var x = 1
    for (x <- 1 to width) {
      outcharBuilder.append("#")
    }

    val outchar = outcharBuilder.toString
    for (x <- 1 to lines) {
      println(outchar)
    }
  }
}
