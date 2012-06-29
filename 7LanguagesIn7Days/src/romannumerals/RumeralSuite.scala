package romannumerals
import junit.framework.TestCase

class RumeralSuite extends TestCase {

  val arabicToRoman = List( (1, "I"), (2, "II"), (3, "III"), (4, "IV"), (5, "V"),
		  					(11, "XI"),
		  					(10, "X"), (50, "L"), (100,"C" ))
  
  def testAllArabicToRomanNumeralConversions(){
    arabicToRoman.foreach( pair  => {
       val convertedNumeral = new Rumeral().toRomanNumeral(pair._1)
       assert(convertedNumeral == pair._2, "failure " + pair._2 + "(expected) does not equal " +  convertedNumeral)
    })
  }
  
  
  
}