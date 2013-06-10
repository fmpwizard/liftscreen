package code 
package snippet 

import scala.xml.{NodeSeq, Text}
import net.liftweb.util._
import net.liftweb.common._
import code.lib._
import Helpers._

class Company {
  if ( 20%2 > 1 ) {
    "*" #> <lift="Company.addCompany"></lift>
  } else {
    "*" #> <lift="Company.showCompany"></lift>
  }


}


object AskAboutIceCream1 extends LiftScreen {
  val flavor = field(S ? "What's your favorite Ice cream flavor", "")

  def finish() {
    S.notice("I like "+flavor.is+" too!")
  }
}

object AskAboutIceCream2 extends LiftScreen {
  val name = field(S ? "What's your name", "")

  def finish() {
    S.notice("I like "+name.is+" too!")
  }
}
