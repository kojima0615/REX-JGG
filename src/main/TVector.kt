package src.main

import java.io.BufferedReader
import java.io.PrintWriter
import kotlin.collections.ArrayList

class TVector {

    var fArray: ArrayList<Double>
    var EPS = 1e-9

    constructor() {
        fArray = arrayListOf<Double>()
    }

    constructor(src: ArrayList<Double>) {
        fArray = ArrayList<Double>(src.size)
        for (i in 0..src.size) {
            fArray[i] = src[i]
        }
    }

    constructor(src: TVector) {
        fArray = ArrayList<Double>(src.fArray.size)
        for (i in 0..src.fArray.size) {
            fArray[i] = src.fArray[i]
        }
    }

    fun clone(): TVector {
        return TVector(fArray)
    }

    fun copyFrom(src: TVector): TVector {
        if (fArray.size != src.fArray.size) {
            fArray = ArrayList<Double>(src.fArray.size)
        }
        for (i in 0..fArray.size) {
            fArray[i] = src.fArray[i]
        }
        return this
    }

    fun writeTo(pw: PrintWriter) {
        pw.println(fArray.size)
        for (i in 0..fArray.size) {
            if (i != fArray.size - 1) {
                pw.print(fArray[i])
                pw.print(" ")
            }
            else{
                pw.print(fArray[i])
            }
        }
        pw.println()
    }

    fun readFrom(br:BufferedReader){
        var dimension = br.readLine().toInt()
        if(fArray.size != dimension){
            fArray = ArrayList<Double>(dimension)
        }
        val tokens = br.readLine().split(" ")
        for(i in 0..tokens.size){
            fArray[i] = tokens[i].toDouble()
        }
    }

    //toStringから



}