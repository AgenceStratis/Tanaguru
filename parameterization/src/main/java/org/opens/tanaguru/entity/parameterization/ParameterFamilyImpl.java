/*
 * Tanaguru - Automated webpage assessment
 * Copyright (C) 2008-2011  Open-S Company
 *
 * This file is part of Tanaguru.
 *
 * Tanaguru is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact us by mail: open-s AT open-s DOT com
 */
package org.opens.tanaguru.entity.parameterization;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jkowalczyk
 */
@Entity
@Table(name = "PARAMETER_FAMILY")
@XmlRootElement
public class ParameterFamilyImpl implements ParameterFamily, Serializable{

    private static final long serialVersionUID = -6433539300057498390L;

    @Id
    @GeneratedValue
    @Column(name = "Id_Parameter_Family")
    private Long id;

    @Column(name = "Cd_Parameter_Family")
    private String paramFamilyCode;

    @Column(name = "Description")
    private String description;

    @Column(name = "Short_Label")
    private String shortLabel;

    @Column(name = "Long_Label")
    private String longLabel;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getParameterFamilyCode() {
        return paramFamilyCode;
    }

    @Override
    public void setParameterFamilyCode(String parameterFamilyCode) {
        this.paramFamilyCode = parameterFamilyCode;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getLongLabel() {
        return longLabel;
    }

    @Override
    public void setLongLabel(String longLabel) {
        this.longLabel = longLabel;
    }

    @Override
    public String getShortLabel() {
        return shortLabel;
    }

    @Override
    public void setShortLabel(String shortLabel) {
        this.shortLabel = shortLabel;
    }

}