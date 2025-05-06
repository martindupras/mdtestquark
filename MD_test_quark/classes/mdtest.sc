// MD 20250413
//
// trying to create a new class for learning purposes
//
// Will make a dummy class "pet"

// This works.

Pet : Object {
	var age; // private instance variable. Not using <> so not gettable directly, I'm guessing.

	// class method because start with '*'
    *new { |ageValue|

		//^super.new creates a new instance
		//and init is an initialisation step on the instance
        ^super.new.init(ageValue)


    }

    init { |ageValue|
        age = ageValue;
        ^this
    }

    getAge {
        ^age
    }
}




