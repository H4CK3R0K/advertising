package website.advertisement.service;

import website.advertisement.Model.Client;

import java.util.List;

public interface ServiceClient {

    public void save(Client client);

    public List<Client> getAll();

    public Client getOne(Long id);

    public void deleteForId(Long id);
}

