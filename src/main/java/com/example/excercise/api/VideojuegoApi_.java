/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.example.excercise.api;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-06T18:58:23.364+02:00")

@Api(value = "videojuego", description = "the videojuego API")
public interface VideojuegoApi_ {

    @ApiOperation(value = "Add un nuevo videojuego", nickname = "addVideojuego", notes = "", response = VideojuegoDto.class, tags={ " VideojuegoDto", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = VideojuegoDto.class),
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/videojuego",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.POST)
    ResponseEntity<VideojuegoDto> addVideojuego(@ApiParam(value = "Objeto videojuego add a BBDD" ,required=true )  @Valid @RequestBody VideojuegoDto body);


    @ApiOperation(value = "Deletes un videojuego", nickname = "deleteVideojuego", notes = "", tags={ "VideojuegoDto", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Videojuego not found") })
    @RequestMapping(value = "/videojuego/{VideojuegoId}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteVideojuego(@ApiParam(value = "Videojuego id to delete",required=true) @PathVariable("VideojuegoId") Long videojuegoId,@ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey);


    @ApiOperation(value = "Buscar videojuego por ID", nickname = "getVideojuegoById", notes = "Devuelve un videojuego", response = VideojuegoDto.class, tags={ "VideojuegoDto", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = VideojuegoDto.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Videojuego not found") })
    @RequestMapping(value = "/videojuego/{VideojuegoId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<VideojuegoDto> getVideojuegoById(@ApiParam(value = "ID del videojuego a devolver",required=true) @PathVariable("VideojuegoId") Long videojuegoId);


    @ApiOperation(value = "Get todos los videojuegos", nickname = "getVideojuegos", notes = "", tags={ "VideojuegoDto", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation"),
        @ApiResponse(code = 400, message = "Invalid list supplied"),
        @ApiResponse(code = 404, message = "List not found") })
    @RequestMapping(value = "/videojuego",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> getVideojuegos();


    @ApiOperation(value = "Updates un videojuego guardado", nickname = "updateVideojuegoWithForm", notes = "", tags={ "VideojuegoDto", })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/videojuego/{VideojuegoId}",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<Void> updateVideojuegoWithForm(@ApiParam(value = "ID del videojuego a modificar",required=true) @PathVariable("VideojuegoId") Long videojuegoId,@ApiParam(value = "Updated nombre del videojuego") @RequestParam(value="nombre", required=false)  String nombre);

}
