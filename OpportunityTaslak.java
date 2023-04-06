trigger OpportunityTrigger on Opportunity (before insert, before update, before delete, after insert, after update, after delete) {
    // Before Insert Trigger
    if (Trigger.isInsert && Trigger.isBefore) {
        for (Opportunity opp : Trigger.new) {
            // İşlem öncesi değerleri kontrol etmek için bir işlem yapılabilir
        }
    }
    
    // Before Update Trigger
    if (Trigger.isUpdate && Trigger.isBefore) {
        for (Opportunity opp : Trigger.new) {
            // İşlem öncesi değerleri kontrol etmek için bir işlem yapılabilir
        }
    }
    
    // Before Delete Trigger
    if (Trigger.isDelete && Trigger.isBefore) {
        for (Opportunity opp : Trigger.old) {
            // İşlem öncesi değerleri kontrol etmek için bir işlem yapılabilir
        }
    }
    
    // After Insert Trigger
    if (Trigger.isInsert && Trigger.isAfter) {
        for (Opportunity opp : Trigger.new) {
            // İşlem sonrası değerleri kontrol etmek için bir işlem yapılabilir
        }
    }
    
    // After Update Trigger
    if (Trigger.isUpdate && Trigger.isAfter) {
        for (Opportunity opp : Trigger.new) {
            // İşlem sonrası değerleri kontrol etmek için bir işlem yapılabilir
        }
    }
    
    // After Delete Trigger
    if (Trigger.isDelete && Trigger.isAfter) {
        for (Opportunity opp : Trigger.old) {
            // İşlem sonrası değerleri kontrol etmek için bir işlem yapılabilir
        }
    }
}