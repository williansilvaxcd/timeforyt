package com.ws.src

import kotlin.random.Random

fun gerarHoras(): Triple<Int, Int, Int> {
    val horas = Random.nextInt(1, 25)
    val minutos = Random.nextInt(0, 60)
    val segundos = Random.nextInt(0, 60)
    return Triple(horas, minutos, segundos)
}

fun formatarTempo(horas: Int, minutos: Int, segundos: Int): String {
    return "%02d:%02d:%02d".format(horas, minutos, segundos)
}

fun gerarLinkVideo(codigoVideo: String): String {
    val (horas, minutos, segundos) = gerarHoras()
    val tempoFormatado = formatarTempo(horas, minutos, segundos)
    return "https://www.youtube.com/watch?v=$codigoVideo&t=$tempoFormatado"
}

fun main() {
    val codigoVideo = "wsNc35fkkdw"
    val link = gerarLinkVideo(codigoVideo)
    println("Link do video para reprodução aleatória: $link")
}