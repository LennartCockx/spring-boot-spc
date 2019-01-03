package be.faros.springbootspc.bootstrap;

import be.faros.springbootspc.model.Owner;
import be.faros.springbootspc.model.PetType;
import be.faros.springbootspc.model.Vet;
import be.faros.springbootspc.services.OwnerService;
import be.faros.springbootspc.services.PetTypeService;
import be.faros.springbootspc.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petService1) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petService = petService1;
    }

    @Override
    public void run(String... args) {

        PetType dog = new PetType();
        dog.setName("Dog");
        petService.save(dog);
        PetType cat = new PetType();
        cat.setName("Cat");
        petService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("John");
        owner1.setLastName("Machigan");
        owner1.setAddress("Maridian Lane 15");
        owner1.setCity("Goro City");
        owner1.setTelephone("0148478573");

        Owner owner2 = new Owner();
        owner2.setFirstName("Mike");
        owner2.setLastName("Tennison");

        ownerService.save(owner1);
        ownerService.save(owner2);
        System.out.println("Loading Owners");

        Vet vet1 = new Vet();
        vet1.setFirstName("Minne");
        vet1.setLastName("Rechelle");

        Vet vet2 = new Vet();
        vet2.setFirstName("Goran");
        vet2.setLastName("Rapustido");

        vetService.save(vet1);
        vetService.save(vet2);
        System.out.println("Loading Vets");

    }
}
