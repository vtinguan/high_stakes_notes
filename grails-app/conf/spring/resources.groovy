import br.com.highstakes.exceptions.HighStakesException

// Place your Spring DSL code here
beans = {
    highStakesException(HighStakesException) { bean ->
        bean.scope = 'request'
        bean.singleton = false
    }

}
