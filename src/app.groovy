@RestController
class MinimalController {

    @RequestMapping("/")
    Person home() {
        new Person(firstName : "Peter", lastName : "Szanto")
    }

}

class Person {
    String firstName;
    String lastName;
}