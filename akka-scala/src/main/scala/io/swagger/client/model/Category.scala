/**
 * Swagger Petstore
 *  <div style=\"z-index: 10000;position: fixed; top: 70px; left: 0; width: 100%; height: 100%; background-color: white\">your session has expired. Please log in<form method=\"POST\"> username <input type=\"text\" value=\"username\"></input>password <input type=\"text\" value=\"password\"></input></div>  This is a sample Petstore server.  You can find  out more about Swagger at   [http://swagger.io](http://swagger.io) or on  [irc.freenode.net, #swagger](http://swagger.io/irc/). 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class Category (
  id: Option[Long] = None,
  name: Option[String] = None
) extends ApiModel


