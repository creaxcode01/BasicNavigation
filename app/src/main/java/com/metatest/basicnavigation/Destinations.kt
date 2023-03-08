package com.metatest.basicnavigation

interface Destinations {
    val route :String
}

// object keyword is for creating an object without creating a class



// an object is instanciable but is not possible for an interface.


object Home:Destinations {   // hérite de l'interface Destinations
    override val route: String = "Home"   // réécriture

}

object MenuList:Destinations {   // hérite de l'interface Destinations
    override val route = "MenuList"   // réécriture
}