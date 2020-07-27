package com.headless.api.internal.resource.v1_0;

import com.liferay.portal.vulcan.resource.OpenAPIResource;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Generated;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

/**
 * @author Javier Gamarra
 * @generated
 */
@Component(properties = "OSGI-INF/liferay/rest/v1_0/openapi.properties", service = OpenAPIResourceImpl.class)
@Generated("")
@OpenAPIDefinition(info = @Info(description = "API for accessing Headless details.", license = @License(name = "Apache 2.0", url = "http://www.apache.org/licenses/LICENSE-2.0.html"), title = "Headless API", version = "v1.0"))
@Path("/v1.0")
public class OpenAPIResourceImpl {

	@GET
	@Path("/rbtest")
	public String getOpenAPITest() {
		System.out.println("getOpenAPITest Logsssssssssss");
		return "Rest Builder Test";
	}

	@GET
	@Path("/openapi.{type:json|yaml}")
	@Produces({ MediaType.APPLICATION_JSON, "application/yaml" })
	public Response getOpenAPI(@PathParam("type") String type) throws Exception {

		try {
			Class<? extends OpenAPIResource> clazz = _openAPIResource.getClass();

			clazz.getMethod("getOpenAPI", Set.class, String.class, UriInfo.class);
		} catch (NoSuchMethodException noSuchMethodException) {
			return _openAPIResource.getOpenAPI(null, null, _resourceClasses, null, type, _uriInfo);
		}

		return _openAPIResource.getOpenAPI(null, null, _resourceClasses, null, type, _uriInfo);
	}

	@Reference
	private OpenAPIResource _openAPIResource;

	@Context
	private UriInfo _uriInfo;

	private final Set<Class<?>> _resourceClasses = new HashSet<Class<?>>() {
		{
			add(OpenAPIResourceImpl.class);
		}
	};

}