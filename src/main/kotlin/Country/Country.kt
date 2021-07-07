package Country

data class Country(
    val name: String,
    val population: Population,
    val region: Region
)

data class Population(
    val total: Int
)

data class Region(
    val region: String
)

