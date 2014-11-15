package org.msdai.eerigo.service.serviceinterface.servicecontract.query;

import org.msdai.eerigo.service.serviceinterface.datacontract.PageResultDTO;
import org.msdai.eerigo.service.serviceinterface.message.CategoryQueryRequestMessage;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by fengfeng on 14/11/15.
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface CategoryQueryService {
    @POST
    @Path("/queryCategories")
    PageResultDTO queryCategories(CategoryQueryRequestMessage categoryQueryRequestMessage);
}