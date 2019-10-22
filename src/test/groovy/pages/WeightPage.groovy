package pages

import geb.Page

class WeightPage extends Page {
    static at = {title=="Decohere - Planet Weight Calculator"}
    static url = "https://decohere.herokuapp.com/planets"

    static content = {
      weight { $('#wt') }
      calculate { $('#calculate') }
      mercury_weight { $('#outputmrc') }
 
      calculateWeight { weightValue ->
        weight.value(weightValue)
        calculate.click();
      }
 
      weight_on_mercury { mercury_weight.value() }
    }

}