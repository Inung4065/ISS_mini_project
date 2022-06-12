$(document).ready( function () {

    var query = window.location.search;
	var param = new URLSearchParams( query );
	var accountId = param.get( 'user' );

	var contentsAccountId = $( "#userId" ).val(  );

	if ( accountId == contentsAccountId ) {

		$( "#tittleName" ).attr( "readonly", false );
		$( "#contents" ).attr( "readonly", false );	
	}
});