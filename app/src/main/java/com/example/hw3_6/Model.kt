package com.example.hw3_6

class Model {
    companion object {
        private var list = arrayListOf<TrackModel>(
            TrackModel("Orion", "Metallica", "Master of Puppets", "https://cdn.shopify.com/s/files/1/0581/0159/6351/products/1_00300591_003.jpg?v=1666488539", "8:12", "https://now.morsmusic.org/load/1175923546/Metallica_-_Orion_(musmore.com).mp3"),
            TrackModel("Damage, Inc", "Metallica", "Master of Puppets", "https://cdn.shopify.com/s/files/1/0581/0159/6351/products/1_00300591_003.jpg?v=1666488539", "5:08", "https://dl1.mp3party.net/download/9584036"),
            TrackModel("Leper Messiah", "Metallica", "Master of Puppets", "https://cdn.shopify.com/s/files/1/0581/0159/6351/products/1_00300591_003.jpg?v=1666488539", "5:40", "https://dl1.mp3party.net/download/9584034"),
            TrackModel("Battery", "Metallica", "Master of Puppets", "https://cdn.shopify.com/s/files/1/0581/0159/6351/products/1_00300591_003.jpg?v=1666488539", "5:12", "https://dl1.mp3party.net/download/10124057"),
            TrackModel("The Thing That Should Not Be", "Metallica", "Master of Puppets", "https://cdn.shopify.com/s/files/1/0581/0159/6351/products/1_00300591_003.jpg?v=1666488539", "6:36", "https://www.midis101.com/play-midi/53067-metallica-the-thing-that-should-not-be.mp3"),
            TrackModel("Master of Puppets", "Metallica", "Master of Puppets", "https://cdn.shopify.com/s/files/1/0581/0159/6351/products/1_00300591_003.jpg?v=1666488539", "8:35", "https://dl4s2.dizer.net/aHR0cDovL2YubXAzcG9pc2submV0L21wMy8wMDIvMjQ4LzA2NS8yMjQ4MDY1Lm1wMz90aXRsZT1NZXRhbGxpY2ErLStNYXN0ZXIrb2YrUHVwcGV0cyslMjhkaXplci5uZXQlMjkubXAz"),
            TrackModel("Welcome Home (Sanitarium)", "Metallica", "Master of Puppets", "https://cdn.shopify.com/s/files/1/0581/0159/6351/products/1_00300591_003.jpg?v=1666488539", "6:27", "https://dl1.mp3party.net/download/2129"),
            TrackModel("Disposable Heroes", "Metallica", "Master of Puppets","https://cdn.shopify.com/s/files/1/0581/0159/6351/products/1_00300591_003.jpg?v=1666488539", "8:17", "https://dl1.mp3party.net/download/9562663")
        )

        fun getList() = list
    }
}