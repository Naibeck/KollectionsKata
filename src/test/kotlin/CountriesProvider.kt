import Country.Country
import Country.Population
import Country.Region

object CountriesProvider {

    val countries: List<Country> = listOf(
        Country(name = "Uruguay", Population(total = 3_462_000), Region("America")),
        Country(name = "Argentina", Population(total = 44_940_000), Region("America")),
        Country(name = "Tailandia", Population(total = 69_630_000), Region("Asia")),
        Country(name = "Mexico", Population(total = 127_600_000), Region("America")),
        Country(name = "Colombia", Population(total = 50_340_000), Region("America")),
        Country(name = "El Salvador", Population(total = 6_540_000), Region("America"))
    )

    private val asianCountries: List<Country> = listOf(
        Country(name = "Tailandia", Population(total = 69_630_000), Region("Asia"))
    )

    private val americanCountries: List<Country> = listOf(
        Country(name = "Uruguay", Population(total = 3_462_000), Region("America")),
        Country(name = "Argentina", Population(total = 44_940_000), Region("America")),
        Country(name = "Mexico", Population(total = 127_600_000), Region("America")),
        Country(name = "Colombia", Population(total = 50_340_000), Region("America")),
        Country(name = "El Salvador", Population(total = 6_540_000), Region("America"))
    )

    val allCountries: List<List<Country>> = listOf(
        asianCountries,
        americanCountries
    )
}