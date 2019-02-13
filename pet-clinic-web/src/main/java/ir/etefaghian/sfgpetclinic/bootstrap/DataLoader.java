package ir.etefaghian.sfgpetclinic.bootstrap;


import ir.etefaghian.sfgpetclinic.model.Owner;
import ir.etefaghian.sfgpetclinic.model.Vet;
import ir.etefaghian.sfgpetclinic.services.OwnerService;
import ir.etefaghian.sfgpetclinic.services.VetSrvice;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final VetSrvice vetSrvice;
    private final OwnerService ownerSrvice;

    public DataLoader(VetSrvice vetSrvice, OwnerService ownerSrvice) {
        this.vetSrvice = vetSrvice;
        this.ownerSrvice = ownerSrvice;
    }


    @Override
    public void run(String... args) throws Exception {

        Vet vet1 =  new Vet();
        vet1.setId(1L);
        vet1.setfirstName("john");
        vet1.setLastName("stone");
        vetSrvice.save(vet1);

        Vet vet2 =  new Vet();
        vet1.setId(2L);
        vet1.setfirstName("Doctor");
        vet1.setLastName("jackole");
        vetSrvice.save(vet2);

        System.out.println("Loaded vets.....");

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setfirstName("shirFarhad");
        owner1.setLastName("balaBarareh");
        ownerSrvice.save(owner1);

        Owner owner2 = new Owner();
        owner1.setId(2L);
        owner1.setfirstName("kianosh");
        owner1.setLastName("tehrani");
        ownerSrvice.save(owner2);
        System.out.println("Loaded owners......");







    }
}
