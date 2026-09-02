package com.example.demo.validators;

import com.example.demo.domain.Part;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidPartInventory implements ConstraintValidator<ValidPartInventoryAnnotation, Part> {

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext context) {

        if (part == null) {
            return true;
        }

        return part.getInv() >= part.getMinInv()
                && part.getInv() <= part.getMaxInv();
    }
}