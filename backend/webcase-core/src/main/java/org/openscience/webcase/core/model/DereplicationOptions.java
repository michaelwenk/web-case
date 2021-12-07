package org.openscience.webcase.core.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class DereplicationOptions {
    private double shiftTolerance;
    private double maxAverageDeviation;
    private boolean checkMultiplicity;
    private boolean checkEquivalencesCount;
    private boolean useMF;
}
