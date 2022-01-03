fun main(args: Array<String>) {
    //code by AHS

    println("Segitiga- Looping")

    print("masukkan jumlah: ")
    var angka = readLine()!!.toInt()// konversi string ke int


    for (a in 1..angka) {
        for (b in angka - 1 downTo a) {
            print(" ")
        }
        for (c in a downTo 1) {
            print(" *")
        }
        println()
    }
    println()
    for (d in 1..angka) {
        for (b in angka downTo d) {
            print(" * ")
        }
        println()
    }
    println()
    for (e in angka.downTo(1)) {
        for (f in angka.downTo(e)){
            print(" * ")
        }
        println()
    }
}