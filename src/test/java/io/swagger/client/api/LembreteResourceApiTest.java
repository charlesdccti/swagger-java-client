/*
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Lembrete;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LembreteResourceApi
 */
@Ignore
public class LembreteResourceApiTest {

    private final LembreteResourceApi api = new LembreteResourceApi();

    
    /**
     * atualizaLembrete
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void atualizaLembreteUsingPUTTest() throws ApiException {
        Lembrete lembrete = null;
        Long id = null;
        Lembrete response = api.atualizaLembreteUsingPUT(lembrete, id);

        // TODO: test validations
    }
    
    /**
     * deletaLembreteById
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletaLembreteByIdUsingDELETETest() throws ApiException {
        Long id = null;
        api.deletaLembreteByIdUsingDELETE(id);

        // TODO: test validations
    }
    
    /**
     * deletaLembrete
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletaLembreteUsingDELETETest() throws ApiException {
        Lembrete lembrete = null;
        api.deletaLembreteUsingDELETE(lembrete);

        // TODO: test validations
    }
    
    /**
     * findById
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findByIdUsingGETTest() throws ApiException {
        Long id = null;
        Lembrete response = api.findByIdUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * listaLembretes
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listaLembretesUsingGETTest() throws ApiException {
        List<Lembrete> response = api.listaLembretesUsingGET();

        for (Lembrete lembrete: response) {
            System.out.println("===> "+lembrete.getConteudo());
        }
        // TODO: test validations
    }
    
    /**
     * salvaLembrete
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void salvaLembreteUsingPOSTTest() throws ApiException {
        Lembrete lembrete = null;
        Lembrete response = api.salvaLembreteUsingPOST(lembrete);

        // TODO: test validations
    }
    
}