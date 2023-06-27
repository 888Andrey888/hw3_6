package com.example.hw3_6

class Model {
    companion object {
        private var list = arrayListOf<TrackModel>(
            TrackModel("Orion", "Metallica", "Master of Puppets", "https://cdn.shopify.com/s/files/1/0581/0159/6351/products/1_00300591_003.jpg?v=1666488539", "8:12"),
            TrackModel("Damage, Inc", "Metallica", "Master of Puppets", "https://cdn.shopify.com/s/files/1/0581/0159/6351/products/1_00300591_003.jpg?v=1666488539", "5:08"),
            TrackModel("Leper Messiah", "Metallica", "Master of Puppets", "https://cdn.shopify.com/s/files/1/0581/0159/6351/products/1_00300591_003.jpg?v=1666488539", "5:40"),
            TrackModel("Battery", "Metallica", "Master of Puppets", "https://cdn.shopify.com/s/files/1/0581/0159/6351/products/1_00300591_003.jpg?v=1666488539", "5:12"),
            TrackModel("The Thing That Should Not Be", "Metallica", "Master of Puppets", "https://cdn.shopify.com/s/files/1/0581/0159/6351/products/1_00300591_003.jpg?v=1666488539", "6:36"),
            TrackModel("Master of Puppets", "Metallica", "Master of Puppets", "https://cdn.shopify.com/s/files/1/0581/0159/6351/products/1_00300591_003.jpg?v=1666488539", "8:35"),
            TrackModel("Welcome Home (Sanitarium)", "Metallica", "Master of Puppets", "https://cdn.shopify.com/s/files/1/0581/0159/6351/products/1_00300591_003.jpg?v=1666488539", "6:27"),
            TrackModel("Disposable Heroes", "Metallica", "Master of Puppets","https://cdn.shopify.com/s/files/1/0581/0159/6351/products/1_00300591_003.jpg?v=1666488539", "8:17")
        )

        fun getList() = list
    }
}