class Colours {

    private val colours = listOf("Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Black", "Silver")

    fun getAll (): List<String>{
        //TODO return the colours list
        return listOf(colours.elementAt(0))
    }

    fun numberOfColours (): Int{
        //TODO return the size of the colours list
        return Int.SIZE_BYTES
    }

    fun firstColour() : String{
        //TODO return the first colour in the list
        return colours.elementAt(0)
    }

    fun lastColour() : String{
        //TODO return the last colour list
        return colours.elementAt(8)
    }

    fun coloursInAplhabeticOrder() : List<String>{
        //TODO return the colours in alphabetical order
        return colours.sorted()
    }

    //map takes each element and treverses throught each element, and converting each one to capital case

    fun coloursInAllCapitals() : List<String>{
        //TODO return the colours in ALL CAPS
        return colours.map { it.toUpperCase() }
    }

    fun coloursStartingWithLetter(letter: Char) : List<String>{
        //TODO return the colours starting with the letter passed as a parameter
        return colours.filter { it.startsWith('B') }
    }

    fun coloursWithSpecificNumberOfChars(size: Int) : List<String>{
        //TODO return the colours that have exactly the same number of chars as the number passed as a parameter
        return colours.filter {it.length == size}
    }

    fun coloursWithLessCharsThan(size: Int) : List<String>{
        //TODO return the colours that have less chars than the number passed as s parameter
        return colours.filter {it.length < size}
    }

    fun isColourInTheList(colour : String) : Boolean{
        //TODO return true of the colour passed as a parameter is in the list and false otherwise
        // Note: the search should be case insensitive - if blue is passed as a parameter it should find Blue, BLUE etc.
        var result = colours.filter { it.contains(colour) }
        if(result.equals(colour)) {
            return true
        }
        return false
    }

    //TODO Write THREE additional functions of your choice that will perform some sort of
    // analysis on the colours list.

    fun secondColorInTheList() : String? {
        var colour = colours.get(1)
        return colour
    }

    fun reverseOrder() : List<String> {
        return colours.reversed()
    }

    fun clear(): Boolean {
        var a: Boolean = colours.isEmpty()
        return a
    }

}