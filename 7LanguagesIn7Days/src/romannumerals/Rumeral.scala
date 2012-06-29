package romannumerals

class Rumeral {

  val converter = Map(1 -> "I", 2-> "II", 3->"III", 4->"IV",  5 -> "V", 10 -> "X", 50 -> "L", 100 -> "C")

  def toRomanNumeral(number: Int) = {
    converter.get(number).getOrElse({ calculateCompositeRomanFromArabic(number.toString) })
  }

  def calculateCompositeRomanFromArabic(number: String) = {
    number.foldRight("")((nextCharacter, accumulated) => {
      if (nextCharacter != '0')
        converter(nextCharacter.asDigit) + accumulated
      else accumulated
    })
  }
}