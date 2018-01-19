$(function(){
	
	//solving the active menu problem
	switch(menu){
		case 'About Us':
			$('#about').addClass('active');
			break;
		case 'Contact Us':
			$('#contact').addClass('active');
			break;
		case 'All Products':
			$('#listProducts').addClass('active');
			break;
		default:
			if(menu == "Home") break;
			$('#home').addClass('active');
			$('#a_'+menu).addClass('active');
			break;
	}

	//code for jquery datatable
	//create a dataset
	
	var products=[
					['1','ABC'],
					['2','BCD'],
					['3','CDE'],
					['4','DEF'],
					['5','EFG'],
					['6','FGH'],
					['7','GHI'],
					['8','HIJ']
				];
	
	var $table=$('#productListTable');
	
	//execute the below code only where we have this table
	if($table.length){
		
		$table.DataTable({
			lengthMenu:[[3,5,10,-1],['3 Records','5 Records','10 Records','All']],
			pageLength:5,
			data:products
			}
		);
		
	}
	
});