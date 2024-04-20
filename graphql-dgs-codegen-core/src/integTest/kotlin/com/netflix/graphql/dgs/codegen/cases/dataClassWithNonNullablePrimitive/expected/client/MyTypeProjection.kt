package com.netflix.graphql.dgs.codegen.cases.dataClassWithNonNullablePrimitive.expected.client

import com.netflix.graphql.dgs.client.codegen.InputValueSerializerInterface
import com.netflix.graphql.dgs.codegen.GraphQLProjection

public class MyTypeProjection(
  inputValueSerializer: InputValueSerializerInterface? = null,
) : GraphQLProjection(inputValueSerializer) {
  public val count: MyTypeProjection
    get() {
      field("count")
      return this
    }

  public val truth: MyTypeProjection
    get() {
      field("truth")
      return this
    }

  public val floaty: MyTypeProjection
    get() {
      field("floaty")
      return this
    }
}
