# Kotlin Kollections Kata
The goal of this kata is to allow the participants to gather the knowledge of using Kotlin Collections api.

The tests are already created but, it requires for the participants to populate and provide them with its logic, each tests is specific as well as the service that it requires to handle the logic.

## Operators covered
* map: transform the collection into a different value
* flatMap: flatten multiple collections into a single collection
* filter: create a new collection based on the condition given
* drop: avoid n values
* take: take n values
* sumBy: return the sum of a given value
* groupBy: group the collection into a Grouping object

## Before you start
Check `CountriesProvider` object to provide the data for the tests cases.
Check `CountriesServiceTest` class to see all the tests related to Countries.

`Country` is a `data class`, so you will have access to `equals` and `copy` by default, also `Population` and `Region` are data classes.

For further reading you can check the official documentation for [Collections](https://kotlinlang.org/docs/collections-overview.html).

## Rules
* Use only `listOf` to avoid mutability
* Use only `val` to avoid mutability
* Avoid creating other functions, other than the one that `CountriesService` has.
* Use only the operators mentioned above.
* Either use `countries` or `allCountries` from `CountriesProvider` but for the flatten case you need to use `allCountries`
* Don't modify the `CountriesService` class outside the `TODO()` instances