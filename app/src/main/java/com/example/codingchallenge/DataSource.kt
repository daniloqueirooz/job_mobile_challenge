package com.example.codingchallenge

import com.example.codingchallenge.models.Challenge

class DataSource {

    companion object {

        fun createDataSet(): ArrayList<Challenge> {
            val list = ArrayList<Challenge>()

            list.add(
                Challenge(
                    nome = "",
                    lançamento = 2022,
                    genero = "Ação, aventura",
                    poster = "Homem-Aranha",
                    author = "Stan Lee",
                    title = "Homem-Aranha - Sem Volta para Casa",
                )
            )

            list.add(
                Challenge(
                    nome = "Homem de Ferro",
                    lançamento = 2014,
                    genero = "Ação, aventura",
                    poster = "Homem de Ferro",
                    author = "Stan Lee",
                    title = "Homem de Ferro",
                )
            )

            list.add(
                Challenge(
                    nome = "Doutor Estranho",
                    lançamento = 2022,
                    genero = "Ação, aventura",
                    poster = "Doutor Estranho",
                    author = "Stan Lee",
                    title = "Doutor Estranho no Multiverso da Loucura",
                )
            )

            list.add(
                Challenge(
                    nome = "Águas Profundas",
                    lançamento = 2022,
                    genero = "Drama, romance",
                    poster = "Aguas profundas",
                    author = "Adrian Lyne",
                    title = "Águas profundas",
                )
            )

            return list

        }
    }
}