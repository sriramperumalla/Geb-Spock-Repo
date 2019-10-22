package specs
import pages.WeightPage 
import geb.spock.GebSpec

class PlanetWeightSpec extends GebSpec {
    def "weight on mercury"() {
      given: "the planet weight page"
        //go 'https://decohere.herokuapp.com/planets'
        to WeightPage

      when: "calculating a weight of 200"
        //$('#wt').value('200')
        //$('#calculate').click()
        calculateWeight(200)
        
      then: "the weight on Mercury is 75.6"
        assert $('#outputmrc').value() == '75.6'
    }
}