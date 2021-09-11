package io.vasilev

import org.specs2.SpecificationLike

trait Discipline:
  self: SpecificationLike =>
    val five = 5
