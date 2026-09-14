package streams.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalExample {

    public static void main(String[] args)
    {
        Optional<String> name = getName();
        // name.ifPresent(x -> System.out.println(x))

        System.out.println(name.orElseGet(()-> "Unknown"));
        
        
        Optional<User> user = getUser();

        user.flatMap(x -> x.address)
            .map(y -> y.city)
            .ifPresentOrElse(System.out::println,()->System.out.println("Unknown"));


        //Stream and Optional
        List<User> users = new ArrayList<>();  //Assume a method getEmail() which return optional<String> email 

        users.stream()
            .map(x -> x.getEmail())
            .filter(y -> y.isPresent())
            .collect(Collectors.toList());



    }

    public static Optional<String> getName()
    {
        return Optional.ofNullable(null);
    }

    public static Optional<User> getUser()
    {
        Address addr = new Address("Bangalore");
        User user1 = new User(addr);

        User user2 = new User();

        return Optional.ofNullable(user2);
    }

}

class User
{
    Optional<Address> address;
    String email = null;
    User()
    {
        this(null);
    }

    User(Address address)
    {
        this.address = Optional.ofNullable(address);
    }

    public Optional<String> getEmail(){
        return Optional.ofNullable(this.email);
    }
}

class Address
{
    String city;
    Address(String city)
    {
        this.city = city;
    }
}


