// Generated by Haxe 4.1.3
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class StringBuf extends haxe.lang.HxObject
{
	public StringBuf(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public StringBuf()
	{
		haxe.root.StringBuf.__hx_ctor__StringBuf(this);
	}
	
	
	protected static void __hx_ctor__StringBuf(haxe.root.StringBuf __hx_this)
	{
		__hx_this.b = new java.lang.StringBuilder();
	}
	
	
	public java.lang.StringBuilder b;
	
	public <T> void add(T x)
	{
		if (haxe.lang.Runtime.isInt(x)) 
		{
			int x1 = ((int) (haxe.lang.Runtime.toInt(((java.lang.Object) (x) ))) );
			java.lang.Object xd = x1;
			java.lang.StringBuilder __temp_expr2 = ((java.lang.StringBuilder) (this.b.append(((java.lang.Object) (xd) ))) );
		}
		else
		{
			java.lang.StringBuilder __temp_expr1 = ((java.lang.StringBuilder) (this.b.append(((java.lang.Object) (x) ))) );
		}
		
	}
	
	
	@Override public java.lang.String toString()
	{
		return this.b.toString();
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef1 = true;
			if (( field != null )) 
			{
				switch (field.hashCode())
				{
					case 98:
					{
						if (field.equals("b")) 
						{
							__temp_executeDef1 = false;
							this.b = ((java.lang.StringBuilder) (value) );
							return value;
						}
						
						break;
					}
					
					
				}
				
			}
			
			if (__temp_executeDef1) 
			{
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		{
			boolean __temp_executeDef1 = true;
			if (( field != null )) 
			{
				switch (field.hashCode())
				{
					case -1776922004:
					{
						if (field.equals("toString")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
						}
						
						break;
					}
					
					
					case 98:
					{
						if (field.equals("b")) 
						{
							__temp_executeDef1 = false;
							return this.b;
						}
						
						break;
					}
					
					
					case 96417:
					{
						if (field.equals("add")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "add")) );
						}
						
						break;
					}
					
					
				}
				
			}
			
			if (__temp_executeDef1) 
			{
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		{
			boolean __temp_executeDef1 = true;
			if (( field != null )) 
			{
				switch (field.hashCode())
				{
					case -1776922004:
					{
						if (field.equals("toString")) 
						{
							__temp_executeDef1 = false;
							return this.toString();
						}
						
						break;
					}
					
					
					case 96417:
					{
						if (field.equals("add")) 
						{
							__temp_executeDef1 = false;
							this.add(((java.lang.Object) (dynargs[0]) ));
							return ((java.lang.Object) (null) );
						}
						
						break;
					}
					
					
				}
				
			}
			
			if (__temp_executeDef1) 
			{
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		baseArr.push("b");
		super.__hx_getFields(baseArr);
	}
	
	
}


