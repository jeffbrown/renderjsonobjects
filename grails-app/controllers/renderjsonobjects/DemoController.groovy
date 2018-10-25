package renderjsonobjects


class DemoController {
	static responseFormats = ['json', 'xml']
	
    def index() {
        def results = []
        results << new Person(name: 'Zack')
        results << new Address(town: 'St. Louis')
        results << new Person(name: 'Matt')
        results << new Address(town: 'San Jose')

        respond view: 'index', model: [theData: results]
    }
}
