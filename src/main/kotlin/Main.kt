

   // Q1 :
    fun main(args: Array<String>) {


        var isAura = "green"
        val playerHealthMadrigal = 89

        val playerKarma = (Math.pow(Math.random(), (100- playerHealthMadrigal)/ 100.0)*20).toInt()
        println(" the player color is : $isAura")

        when(playerKarma ){


            in 0..5 -> isAura= "red"
            in 6 .. 10 ->isAura=  "orange"
            in 11 .. 15 ->isAura= "purple"
            in 16 ..20 ->isAura= "green"
        }

        println( " Aura now is : $isAura ")
        println(" the player karma at the moment $playerKarma")

    }



