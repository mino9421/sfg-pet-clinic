package mino.springframework.sfgpetclinic.services;

import mino.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner FindByLastName(String lastName);

}
