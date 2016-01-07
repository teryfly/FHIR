package org.hl7.fhir.dstu21.model.valuesets;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Thu, Dec 31, 2015 10:35+1100 for FHIR v1.2.0


import org.hl7.fhir.exceptions.FHIRException;

public enum V3EquipmentAlertLevel {

        /**
         * Shut Down, Fix Problem and Re-init
         */
        C, 
        /**
         * No Corrective Action Needed
         */
        N, 
        /**
         * Corrective Action Required
         */
        S, 
        /**
         * Corrective Action Anticipated
         */
        W, 
        /**
         * added to help the parsers
         */
        NULL;
        public static V3EquipmentAlertLevel fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("C".equals(codeString))
          return C;
        if ("N".equals(codeString))
          return N;
        if ("S".equals(codeString))
          return S;
        if ("W".equals(codeString))
          return W;
        throw new FHIRException("Unknown V3EquipmentAlertLevel code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case C: return "C";
            case N: return "N";
            case S: return "S";
            case W: return "W";
            default: return "?";
          }
        }
        public String getSystem() {
          return "http://hl7.org/fhir/v3/EquipmentAlertLevel";
        }
        public String getDefinition() {
          switch (this) {
            case C: return "Shut Down, Fix Problem and Re-init";
            case N: return "No Corrective Action Needed";
            case S: return "Corrective Action Required";
            case W: return "Corrective Action Anticipated";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case C: return "Critical";
            case N: return "Normal";
            case S: return "Serious";
            case W: return "Warning";
            default: return "?";
          }
    }


}

