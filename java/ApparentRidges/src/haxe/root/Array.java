// Generated by Haxe 4.1.3
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class Array<T> extends haxe.lang.HxObject
{
	
	public Array(T[] _native)
	{
		this.__a = _native;
		this.length = _native.length;
	}
	static
	{
		haxe.root.Array.__hx_toString_depth = 0;
		haxe.root.Array.__hx_defaultCapacity = 4;
	}
	
	public Array(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Array()
	{
		haxe.root.Array.__hx_ctor__Array(((haxe.root.Array<T>) (this) ));
		java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
	}
	
	
	public static <T_c> void __hx_ctor__Array(haxe.root.Array<T_c> __hx_this)
	{
		__hx_this.length = 0;
		__hx_this.__a = ((T_c[]) (((java.lang.Object) (new java.lang.Object[0]) )) );
	}
	
	
	public static int __hx_toString_depth;
	
	public static int __hx_defaultCapacity;
	
	public static <X> haxe.root.Array<X> ofNative(X[] _native)
	{
		
			return new Array<X>(_native);
	
	}
	
	
	public static <Y> haxe.root.Array<Y> alloc(int size)
	{
		
			return new Array<Y>((Y[]) ((java.lang.Object)new java.lang.Object[size]));
	
	}
	
	
	public int length;
	
	public T[] __a;
	
	public final haxe.root.Array<T> concat(haxe.root.Array<T> a)
	{
		int length = this.length;
		int len = ( length + a.length );
		T[] retarr = ((T[]) (((java.lang.Object) (new java.lang.Object[len]) )) );
		java.lang.System.arraycopy(((java.lang.Object) (this.__a) ), ((int) (0) ), ((java.lang.Object) (retarr) ), ((int) (0) ), ((int) (length) ));
		java.lang.System.arraycopy(((java.lang.Object) (a.__a) ), ((int) (0) ), ((java.lang.Object) (retarr) ), ((int) (length) ), ((int) (a.length) ));
		return ((haxe.root.Array<T>) (haxe.root.Array.ofNative(((T[]) (retarr) ))) );
	}
	
	
	public final void concatNative(T[] a)
	{
		T[] __a = this.__a;
		int length = this.length;
		int len = ( length + a.length );
		if (( __a.length >= len )) 
		{
			java.lang.System.arraycopy(((java.lang.Object) (a) ), ((int) (0) ), ((java.lang.Object) (__a) ), ((int) (length) ), ((int) (length) ));
		}
		else
		{
			T[] newarr = ((T[]) (((java.lang.Object) (new java.lang.Object[len]) )) );
			java.lang.System.arraycopy(((java.lang.Object) (__a) ), ((int) (0) ), ((java.lang.Object) (newarr) ), ((int) (0) ), ((int) (length) ));
			java.lang.System.arraycopy(((java.lang.Object) (a) ), ((int) (0) ), ((java.lang.Object) (newarr) ), ((int) (length) ), ((int) (a.length) ));
			this.__a = newarr;
		}
		
		this.length = len;
	}
	
	
	public final java.lang.String join(java.lang.String sep)
	{
		haxe.root.StringBuf buf = new haxe.root.StringBuf();
		int i = -1;
		boolean first = true;
		int length = this.length;
		while ((  ++ i < length ))
		{
			if (first) 
			{
				first = false;
			}
			else
			{
				buf.add(haxe.lang.Runtime.toString(sep));
				java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
			}
			
			buf.add(((T) (this.__a[i]) ));
			java.lang.Object __temp_expr2 = ((java.lang.Object) (null) );
		}
		
		return buf.toString();
	}
	
	
	public final java.lang.Object pop()
	{
		T[] __a = this.__a;
		int length = this.length;
		if (( length > 0 )) 
		{
			T val = __a[ -- length];
			__a[length] = null;
			this.length = length;
			return val;
		}
		else
		{
			return null;
		}
		
	}
	
	
	public final int push(T x)
	{
		int length = this.length;
		if (( length >= this.__a.length )) 
		{
			int newLen = ( (( length == 0 )) ? (4) : (( length << 1 )) );
			T[] newarr = ((T[]) (((java.lang.Object) (new java.lang.Object[newLen]) )) );
			java.lang.System.arraycopy(((java.lang.Object) (this.__a) ), ((int) (0) ), ((java.lang.Object) (newarr) ), ((int) (0) ), ((int) (this.__a.length) ));
			this.__a = newarr;
		}
		
		this.__a[length] = x;
		return  ++ this.length;
	}
	
	
	public final void reverse()
	{
		int i = 0;
		int l = this.length;
		T[] a = this.__a;
		int half = ( l >> 1 );
		 -- l;
		while (( i < half ))
		{
			T tmp = a[i];
			a[i] = a[( l - i )];
			a[( l - i )] = tmp;
			 ++ i;
		}
		
	}
	
	
	public final java.lang.Object shift()
	{
		int l = this.length;
		if (( l == 0 )) 
		{
			return null;
		}
		
		T[] a = this.__a;
		T x = a[0];
		 -- l;
		java.lang.System.arraycopy(((java.lang.Object) (a) ), ((int) (1) ), ((java.lang.Object) (a) ), ((int) (0) ), ((int) (( this.length - 1 )) ));
		a[l] = null;
		this.length = l;
		return x;
	}
	
	
	public final haxe.root.Array<T> slice(int pos, java.lang.Object end)
	{
		if (( pos < 0 )) 
		{
			pos = ( this.length + pos );
			if (( pos < 0 )) 
			{
				pos = 0;
			}
			
		}
		
		if (haxe.lang.Runtime.eq(end, null)) 
		{
			end = this.length;
		}
		else
		{
			if (( ((int) (haxe.lang.Runtime.toInt(end)) ) < 0 )) 
			{
				end = ((int) (haxe.lang.Runtime.toInt(haxe.lang.Runtime.plus(this.length, end))) );
			}
			
		}
		
		if (( ((int) (haxe.lang.Runtime.toInt(end)) ) > this.length )) 
		{
			end = this.length;
		}
		
		int len = ( ((int) (haxe.lang.Runtime.toInt(end)) ) - ((int) (pos) ) );
		if (( len < 0 )) 
		{
			return new haxe.root.Array<T>();
		}
		
		T[] newarr = ((T[]) (((java.lang.Object) (new java.lang.Object[len]) )) );
		java.lang.System.arraycopy(((java.lang.Object) (this.__a) ), ((int) (pos) ), ((java.lang.Object) (newarr) ), ((int) (0) ), ((int) (len) ));
		return ((haxe.root.Array<T>) (haxe.root.Array.ofNative(((T[]) (newarr) ))) );
	}
	
	
	public final void sort(haxe.lang.Function f)
	{
		if (( this.length == 0 )) 
		{
			return ;
		}
		
		this.quicksort(0, ( this.length - 1 ), f);
	}
	
	
	public final void quicksort(int lo, int hi, haxe.lang.Function f)
	{
		T[] buf = this.__a;
		int i = lo;
		int j = hi;
		T p = buf[( ( i + j ) >> 1 )];
		while (( i <= j ))
		{
			while (( ( i < hi ) && ( ((int) (f.__hx_invoke2_f(0.0, buf[i], 0.0, p)) ) < 0 ) ))
			{
				 ++ i;
			}
			
			while (( ( j > lo ) && ( ((int) (f.__hx_invoke2_f(0.0, buf[j], 0.0, p)) ) > 0 ) ))
			{
				 -- j;
			}
			
			if (( i <= j )) 
			{
				T t = buf[i];
				buf[i++] = buf[j];
				buf[j--] = t;
			}
			
		}
		
		if (( lo < j )) 
		{
			this.quicksort(lo, j, f);
		}
		
		if (( i < hi )) 
		{
			this.quicksort(i, hi, f);
		}
		
	}
	
	
	public final haxe.root.Array<T> splice(int pos, int len)
	{
		if (( len < 0 )) 
		{
			return new haxe.root.Array<T>();
		}
		
		if (( pos < 0 )) 
		{
			pos = ( this.length + pos );
			if (( pos < 0 )) 
			{
				pos = 0;
			}
			
		}
		
		if (( pos > this.length )) 
		{
			pos = 0;
			len = 0;
		}
		else
		{
			if (( ( pos + len ) > this.length )) 
			{
				len = ( this.length - pos );
				if (( len < 0 )) 
				{
					len = 0;
				}
				
			}
			
		}
		
		T[] a = this.__a;
		T[] ret = ((T[]) (((java.lang.Object) (new java.lang.Object[len]) )) );
		java.lang.System.arraycopy(((java.lang.Object) (a) ), ((int) (pos) ), ((java.lang.Object) (ret) ), ((int) (0) ), ((int) (len) ));
		haxe.root.Array<T> ret1 = ((haxe.root.Array<T>) (haxe.root.Array.ofNative(((T[]) (ret) ))) );
		int end = ( pos + len );
		java.lang.System.arraycopy(((java.lang.Object) (a) ), ((int) (end) ), ((java.lang.Object) (a) ), ((int) (pos) ), ((int) (( this.length - end )) ));
		this.length -= len;
		while ((  -- len >= 0 ))
		{
			a[( this.length + len )] = null;
		}
		
		return ret1;
	}
	
	
	public final void spliceVoid(int pos, int len)
	{
		if (( len < 0 )) 
		{
			return ;
		}
		
		if (( pos < 0 )) 
		{
			pos = ( this.length + pos );
			if (( pos < 0 )) 
			{
				pos = 0;
			}
			
		}
		
		if (( pos > this.length )) 
		{
			pos = 0;
			len = 0;
		}
		else
		{
			if (( ( pos + len ) > this.length )) 
			{
				len = ( this.length - pos );
				if (( len < 0 )) 
				{
					len = 0;
				}
				
			}
			
		}
		
		T[] a = this.__a;
		int end = ( pos + len );
		java.lang.System.arraycopy(((java.lang.Object) (a) ), ((int) (end) ), ((java.lang.Object) (a) ), ((int) (pos) ), ((int) (( this.length - end )) ));
		this.length -= len;
		while ((  -- len >= 0 ))
		{
			a[( this.length + len )] = null;
		}
		
	}
	
	
	@Override public java.lang.String toString()
	{
		if (( haxe.root.Array.__hx_toString_depth >= 5 )) 
		{
			return "...";
		}
		
		 ++ haxe.root.Array.__hx_toString_depth;
		try 
		{
			java.lang.String s = this.__hx_toString();
			 -- haxe.root.Array.__hx_toString_depth;
			return s;
		}
		catch (java.lang.Throwable _g)
		{
			java.lang.Object e = ((java.lang.Object) (haxe.Exception.caught(_g).unwrap()) );
			 -- haxe.root.Array.__hx_toString_depth;
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(e)) );
		}
		
		
	}
	
	
	public final java.lang.String __hx_toString()
	{
		haxe.root.StringBuf ret = new haxe.root.StringBuf();
		T[] a = this.__a;
		ret.add(haxe.lang.Runtime.toString("["));
		java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
		boolean first = true;
		{
			int _g = 0;
			int _g1 = this.length;
			while (( _g < _g1 ))
			{
				int i = _g++;
				if (first) 
				{
					first = false;
				}
				else
				{
					ret.add(haxe.lang.Runtime.toString(","));
					java.lang.Object __temp_expr2 = ((java.lang.Object) (null) );
				}
				
				ret.add(((T) (a[i]) ));
				java.lang.Object __temp_expr3 = ((java.lang.Object) (null) );
			}
			
		}
		
		ret.add(haxe.lang.Runtime.toString("]"));
		java.lang.Object __temp_expr4 = ((java.lang.Object) (null) );
		return ret.toString();
	}
	
	
	public final void unshift(T x)
	{
		T[] __a = this.__a;
		int length = this.length;
		if (( length >= __a.length )) 
		{
			int newLen = ( (( length << 1 )) + 1 );
			T[] newarr = ((T[]) (((java.lang.Object) (new java.lang.Object[newLen]) )) );
			java.lang.System.arraycopy(((java.lang.Object) (__a) ), ((int) (0) ), ((java.lang.Object) (newarr) ), ((int) (1) ), ((int) (length) ));
			this.__a = newarr;
		}
		else
		{
			java.lang.System.arraycopy(((java.lang.Object) (__a) ), ((int) (0) ), ((java.lang.Object) (__a) ), ((int) (1) ), ((int) (length) ));
		}
		
		this.__a[0] = x;
		 ++ this.length;
	}
	
	
	public final void insert(int pos, T x)
	{
		int l = this.length;
		if (( pos < 0 )) 
		{
			pos = ( l + pos );
			if (( pos < 0 )) 
			{
				pos = 0;
			}
			
		}
		
		if (( pos >= l )) 
		{
			this.push(x);
			return ;
		}
		else
		{
			if (( pos == 0 )) 
			{
				this.unshift(x);
				return ;
			}
			
		}
		
		if (( l >= this.__a.length )) 
		{
			int newLen = ( (( this.length << 1 )) + 1 );
			T[] newarr = ((T[]) (((java.lang.Object) (new java.lang.Object[newLen]) )) );
			java.lang.System.arraycopy(((java.lang.Object) (this.__a) ), ((int) (0) ), ((java.lang.Object) (newarr) ), ((int) (0) ), ((int) (pos) ));
			newarr[pos] = x;
			java.lang.System.arraycopy(((java.lang.Object) (this.__a) ), ((int) (pos) ), ((java.lang.Object) (newarr) ), ((int) (( pos + 1 )) ), ((int) (( l - pos )) ));
			this.__a = newarr;
			 ++ this.length;
		}
		else
		{
			T[] __a = this.__a;
			java.lang.System.arraycopy(((java.lang.Object) (__a) ), ((int) (pos) ), ((java.lang.Object) (__a) ), ((int) (( pos + 1 )) ), ((int) (( l - pos )) ));
			java.lang.System.arraycopy(((java.lang.Object) (__a) ), ((int) (0) ), ((java.lang.Object) (__a) ), ((int) (0) ), ((int) (pos) ));
			__a[pos] = x;
			 ++ this.length;
		}
		
	}
	
	
	public final boolean remove(T x)
	{
		T[] __a = this.__a;
		int i = -1;
		int length = this.length;
		while ((  ++ i < length ))
		{
			if (haxe.lang.Runtime.eq(__a[i], x)) 
			{
				java.lang.System.arraycopy(((java.lang.Object) (__a) ), ((int) (( i + 1 )) ), ((java.lang.Object) (__a) ), ((int) (i) ), ((int) (( ( length - i ) - 1 )) ));
				__a[ -- this.length] = null;
				return true;
			}
			
		}
		
		return false;
	}
	
	
	public final boolean contains(T x)
	{
		T[] __a = this.__a;
		int i = -1;
		int length = this.length;
		while ((  ++ i < length ))
		{
			if (haxe.lang.Runtime.eq(__a[i], x)) 
			{
				return true;
			}
			
		}
		
		return false;
	}
	
	
	public final int indexOf(T x, java.lang.Object fromIndex)
	{
		int len = this.length;
		T[] a = this.__a;
		int i = ( (haxe.lang.Runtime.eq(fromIndex, null)) ? (0) : (((int) (haxe.lang.Runtime.toInt(fromIndex)) )) );
		if (( i < 0 )) 
		{
			i += len;
			if (( i < 0 )) 
			{
				i = 0;
			}
			
		}
		
		while (( i < len ))
		{
			if (haxe.lang.Runtime.eq(a[i], x)) 
			{
				return i;
			}
			
			 ++ i;
		}
		
		return -1;
	}
	
	
	public final int lastIndexOf(T x, java.lang.Object fromIndex)
	{
		int len = this.length;
		T[] a = this.__a;
		int i = ( (haxe.lang.Runtime.eq(fromIndex, null)) ? (( len - 1 )) : (((int) (haxe.lang.Runtime.toInt(fromIndex)) )) );
		if (( i >= len )) 
		{
			i = ( len - 1 );
		}
		else
		{
			if (( i < 0 )) 
			{
				i += len;
			}
			
		}
		
		while (( i >= 0 ))
		{
			if (haxe.lang.Runtime.eq(a[i], x)) 
			{
				return i;
			}
			
			 -- i;
		}
		
		return -1;
	}
	
	
	public final haxe.root.Array<T> copy()
	{
		int len = this.length;
		T[] __a = this.__a;
		T[] newarr = ((T[]) (((java.lang.Object) (new java.lang.Object[len]) )) );
		java.lang.System.arraycopy(((java.lang.Object) (__a) ), ((int) (0) ), ((java.lang.Object) (newarr) ), ((int) (0) ), ((int) (len) ));
		return ((haxe.root.Array<T>) (haxe.root.Array.ofNative(((T[]) (newarr) ))) );
	}
	
	
	public final haxe.iterators.ArrayIterator<T> iterator()
	{
		return new haxe.iterators.ArrayIterator<T>(((haxe.root.Array<T>) (this) ));
	}
	
	
	public final haxe.iterators.ArrayKeyValueIterator<T> keyValueIterator()
	{
		return new haxe.iterators.ArrayKeyValueIterator<T>(((haxe.root.Array<T>) (this) ));
	}
	
	
	public final void resize(int len)
	{
		if (( this.length < len )) 
		{
			if (( this.__a.length < len )) 
			{
				T[] newArr = ((T[]) (((java.lang.Object) (new java.lang.Object[len]) )) );
				if (( this.length > 0 )) 
				{
					java.lang.System.arraycopy(((java.lang.Object) (this.__a) ), ((int) (0) ), ((java.lang.Object) (newArr) ), ((int) (0) ), ((int) (this.length) ));
				}
				
				this.__a = this.__a = newArr;
			}
			
			this.length = len;
		}
		else
		{
			if (( this.length > len )) 
			{
				this.spliceVoid(len, ( this.length - len ));
			}
			
		}
		
	}
	
	
	public final <S> haxe.root.Array<S> map(haxe.lang.Function f)
	{
		haxe.root.Array<S> ret = ((haxe.root.Array<S>) (((haxe.root.Array) (haxe.root.Array.alloc(((int) (this.length) ))) )) );
		{
			int _g = 0;
			int _g1 = this.length;
			while (( _g < _g1 ))
			{
				int i = _g++;
				ret.__set(i, ((S) (f.__hx_invoke1_o(0.0, this.__get(i))) ));
			}
			
		}
		
		return ret;
	}
	
	
	public final haxe.root.Array<T> filter(haxe.lang.Function f)
	{
		haxe.root.Array<T> ret = new haxe.root.Array<T>(( (T[]) (new java.lang.Object[] {}) ));
		{
			int _g = 0;
			int _g1 = this.length;
			while (( _g < _g1 ))
			{
				int i = _g++;
				T elt = this.__get(i);
				if (haxe.lang.Runtime.toBool(((java.lang.Boolean) (f.__hx_invoke1_o(0.0, elt)) ))) 
				{
					ret.push(elt);
				}
				
			}
			
		}
		
		return ret;
	}
	
	
	public final T __get(int idx)
	{
		T[] __a = this.__a;
		if (( ( idx >= __a.length ) || ( idx < 0 ) )) 
		{
			return null;
		}
		
		return __a[idx];
	}
	
	
	public final T __set(int idx, T v)
	{
		T[] __a = this.__a;
		if (( idx >= __a.length )) 
		{
			int newl = ( idx + 1 );
			if (( idx == __a.length )) 
			{
				newl = ( (( idx << 1 )) + 1 );
			}
			
			T[] newArr = ((T[]) (((java.lang.Object) (new java.lang.Object[newl]) )) );
			if (( this.length > 0 )) 
			{
				java.lang.System.arraycopy(((java.lang.Object) (__a) ), ((int) (0) ), ((java.lang.Object) (newArr) ), ((int) (0) ), ((int) (this.length) ));
			}
			
			__a = newArr;
			this.__a = __a;
		}
		
		if (( idx >= this.length )) 
		{
			this.length = ( idx + 1 );
		}
		
		return __a[idx] = v;
	}
	
	
	public final T __unsafe_get(int idx)
	{
		return this.__a[idx];
	}
	
	
	public final T __unsafe_set(int idx, T val)
	{
		return this.__a[idx] = val;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef1 = true;
			if (( field != null )) 
			{
				switch (field.hashCode())
				{
					case -1106363674:
					{
						if (field.equals("length")) 
						{
							__temp_executeDef1 = false;
							this.length = ((int) (value) );
							return value;
						}
						
						break;
					}
					
					
				}
				
			}
			
			if (__temp_executeDef1) 
			{
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef1 = true;
			if (( field != null )) 
			{
				switch (field.hashCode())
				{
					case 94337:
					{
						if (field.equals("__a")) 
						{
							__temp_executeDef1 = false;
							this.__a = ((T[]) (value) );
							return value;
						}
						
						break;
					}
					
					
					case -1106363674:
					{
						if (field.equals("length")) 
						{
							__temp_executeDef1 = false;
							this.length = ((int) (haxe.lang.Runtime.toInt(value)) );
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
					case -537840087:
					{
						if (field.equals("__unsafe_set")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "__unsafe_set")) );
						}
						
						break;
					}
					
					
					case -1106363674:
					{
						if (field.equals("length")) 
						{
							__temp_executeDef1 = false;
							return this.length;
						}
						
						break;
					}
					
					
					case -537851619:
					{
						if (field.equals("__unsafe_get")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "__unsafe_get")) );
						}
						
						break;
					}
					
					
					case 94337:
					{
						if (field.equals("__a")) 
						{
							__temp_executeDef1 = false;
							return this.__a;
						}
						
						break;
					}
					
					
					case 90678402:
					{
						if (field.equals("__set")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "__set")) );
						}
						
						break;
					}
					
					
					case -1354795244:
					{
						if (field.equals("concat")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "concat")) );
						}
						
						break;
					}
					
					
					case 90666870:
					{
						if (field.equals("__get")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "__get")) );
						}
						
						break;
					}
					
					
					case -1238494133:
					{
						if (field.equals("concatNative")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "concatNative")) );
						}
						
						break;
					}
					
					
					case -1274492040:
					{
						if (field.equals("filter")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "filter")) );
						}
						
						break;
					}
					
					
					case 3267882:
					{
						if (field.equals("join")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "join")) );
						}
						
						break;
					}
					
					
					case 107868:
					{
						if (field.equals("map")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "map")) );
						}
						
						break;
					}
					
					
					case 111185:
					{
						if (field.equals("pop")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "pop")) );
						}
						
						break;
					}
					
					
					case -934437708:
					{
						if (field.equals("resize")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "resize")) );
						}
						
						break;
					}
					
					
					case 3452698:
					{
						if (field.equals("push")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "push")) );
						}
						
						break;
					}
					
					
					case -955047712:
					{
						if (field.equals("keyValueIterator")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "keyValueIterator")) );
						}
						
						break;
					}
					
					
					case 1099846370:
					{
						if (field.equals("reverse")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "reverse")) );
						}
						
						break;
					}
					
					
					case 1182533742:
					{
						if (field.equals("iterator")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "iterator")) );
						}
						
						break;
					}
					
					
					case 109407362:
					{
						if (field.equals("shift")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "shift")) );
						}
						
						break;
					}
					
					
					case 3059573:
					{
						if (field.equals("copy")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "copy")) );
						}
						
						break;
					}
					
					
					case 109526418:
					{
						if (field.equals("slice")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "slice")) );
						}
						
						break;
					}
					
					
					case -467511597:
					{
						if (field.equals("lastIndexOf")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "lastIndexOf")) );
						}
						
						break;
					}
					
					
					case 3536286:
					{
						if (field.equals("sort")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "sort")) );
						}
						
						break;
					}
					
					
					case 1943291465:
					{
						if (field.equals("indexOf")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "indexOf")) );
						}
						
						break;
					}
					
					
					case 1301699851:
					{
						if (field.equals("quicksort")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "quicksort")) );
						}
						
						break;
					}
					
					
					case -567445985:
					{
						if (field.equals("contains")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "contains")) );
						}
						
						break;
					}
					
					
					case -895859076:
					{
						if (field.equals("splice")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "splice")) );
						}
						
						break;
					}
					
					
					case -934610812:
					{
						if (field.equals("remove")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "remove")) );
						}
						
						break;
					}
					
					
					case -821858768:
					{
						if (field.equals("spliceVoid")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "spliceVoid")) );
						}
						
						break;
					}
					
					
					case -1183792455:
					{
						if (field.equals("insert")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "insert")) );
						}
						
						break;
					}
					
					
					case -1776922004:
					{
						if (field.equals("toString")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
						}
						
						break;
					}
					
					
					case -277637751:
					{
						if (field.equals("unshift")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "unshift")) );
						}
						
						break;
					}
					
					
					case -128126757:
					{
						if (field.equals("__hx_toString")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "__hx_toString")) );
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
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		{
			boolean __temp_executeDef1 = true;
			if (( field != null )) 
			{
				switch (field.hashCode())
				{
					case -1106363674:
					{
						if (field.equals("length")) 
						{
							__temp_executeDef1 = false;
							return ((double) (this.length) );
						}
						
						break;
					}
					
					
				}
				
			}
			
			if (__temp_executeDef1) 
			{
				return super.__hx_getField_f(field, throwErrors, handleProperties);
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
					case -537840087:
					{
						if (field.equals("__unsafe_set")) 
						{
							__temp_executeDef1 = false;
							return this.__unsafe_set(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ), ((T) (dynargs[1]) ));
						}
						
						break;
					}
					
					
					case -1354795244:
					{
						if (field.equals("concat")) 
						{
							__temp_executeDef1 = false;
							return this.concat(((haxe.root.Array<T>) (dynargs[0]) ));
						}
						
						break;
					}
					
					
					case -537851619:
					{
						if (field.equals("__unsafe_get")) 
						{
							__temp_executeDef1 = false;
							return this.__unsafe_get(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ));
						}
						
						break;
					}
					
					
					case -1238494133:
					{
						if (field.equals("concatNative")) 
						{
							__temp_executeDef1 = false;
							this.concatNative(((T[]) (dynargs[0]) ));
						}
						
						break;
					}
					
					
					case 90678402:
					{
						if (field.equals("__set")) 
						{
							__temp_executeDef1 = false;
							return this.__set(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ), ((T) (dynargs[1]) ));
						}
						
						break;
					}
					
					
					case 3267882:
					{
						if (field.equals("join")) 
						{
							__temp_executeDef1 = false;
							return this.join(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						break;
					}
					
					
					case 90666870:
					{
						if (field.equals("__get")) 
						{
							__temp_executeDef1 = false;
							return this.__get(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ));
						}
						
						break;
					}
					
					
					case 111185:
					{
						if (field.equals("pop")) 
						{
							__temp_executeDef1 = false;
							return this.pop();
						}
						
						break;
					}
					
					
					case -1274492040:
					{
						if (field.equals("filter")) 
						{
							__temp_executeDef1 = false;
							return this.filter(((haxe.lang.Function) (dynargs[0]) ));
						}
						
						break;
					}
					
					
					case 3452698:
					{
						if (field.equals("push")) 
						{
							__temp_executeDef1 = false;
							return this.push(((T) (dynargs[0]) ));
						}
						
						break;
					}
					
					
					case 107868:
					{
						if (field.equals("map")) 
						{
							__temp_executeDef1 = false;
							return ((haxe.root.Array<java.lang.Object>) (this.map(((haxe.lang.Function) (dynargs[0]) ))) );
						}
						
						break;
					}
					
					
					case 1099846370:
					{
						if (field.equals("reverse")) 
						{
							__temp_executeDef1 = false;
							this.reverse();
						}
						
						break;
					}
					
					
					case -934437708:
					{
						if (field.equals("resize")) 
						{
							__temp_executeDef1 = false;
							this.resize(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ));
						}
						
						break;
					}
					
					
					case 109407362:
					{
						if (field.equals("shift")) 
						{
							__temp_executeDef1 = false;
							return this.shift();
						}
						
						break;
					}
					
					
					case -955047712:
					{
						if (field.equals("keyValueIterator")) 
						{
							__temp_executeDef1 = false;
							return this.keyValueIterator();
						}
						
						break;
					}
					
					
					case 109526418:
					{
						if (field.equals("slice")) 
						{
							__temp_executeDef1 = false;
							return this.slice(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ), ( (( dynargs.length > 1 )) ? (dynargs[1]) : (null) ));
						}
						
						break;
					}
					
					
					case 1182533742:
					{
						if (field.equals("iterator")) 
						{
							__temp_executeDef1 = false;
							return this.iterator();
						}
						
						break;
					}
					
					
					case 3536286:
					{
						if (field.equals("sort")) 
						{
							__temp_executeDef1 = false;
							this.sort(((haxe.lang.Function) (dynargs[0]) ));
						}
						
						break;
					}
					
					
					case 3059573:
					{
						if (field.equals("copy")) 
						{
							__temp_executeDef1 = false;
							return this.copy();
						}
						
						break;
					}
					
					
					case 1301699851:
					{
						if (field.equals("quicksort")) 
						{
							__temp_executeDef1 = false;
							this.quicksort(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ), ((int) (haxe.lang.Runtime.toInt(dynargs[1])) ), ((haxe.lang.Function) (dynargs[2]) ));
						}
						
						break;
					}
					
					
					case -467511597:
					{
						if (field.equals("lastIndexOf")) 
						{
							__temp_executeDef1 = false;
							return this.lastIndexOf(((T) (dynargs[0]) ), ( (( dynargs.length > 1 )) ? (dynargs[1]) : (null) ));
						}
						
						break;
					}
					
					
					case -895859076:
					{
						if (field.equals("splice")) 
						{
							__temp_executeDef1 = false;
							return this.splice(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ), ((int) (haxe.lang.Runtime.toInt(dynargs[1])) ));
						}
						
						break;
					}
					
					
					case 1943291465:
					{
						if (field.equals("indexOf")) 
						{
							__temp_executeDef1 = false;
							return this.indexOf(((T) (dynargs[0]) ), ( (( dynargs.length > 1 )) ? (dynargs[1]) : (null) ));
						}
						
						break;
					}
					
					
					case -821858768:
					{
						if (field.equals("spliceVoid")) 
						{
							__temp_executeDef1 = false;
							this.spliceVoid(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ), ((int) (haxe.lang.Runtime.toInt(dynargs[1])) ));
						}
						
						break;
					}
					
					
					case -567445985:
					{
						if (field.equals("contains")) 
						{
							__temp_executeDef1 = false;
							return this.contains(((T) (dynargs[0]) ));
						}
						
						break;
					}
					
					
					case -1776922004:
					{
						if (field.equals("toString")) 
						{
							__temp_executeDef1 = false;
							return this.toString();
						}
						
						break;
					}
					
					
					case -934610812:
					{
						if (field.equals("remove")) 
						{
							__temp_executeDef1 = false;
							return this.remove(((T) (dynargs[0]) ));
						}
						
						break;
					}
					
					
					case -128126757:
					{
						if (field.equals("__hx_toString")) 
						{
							__temp_executeDef1 = false;
							return this.__hx_toString();
						}
						
						break;
					}
					
					
					case -1183792455:
					{
						if (field.equals("insert")) 
						{
							__temp_executeDef1 = false;
							this.insert(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ), ((T) (dynargs[1]) ));
						}
						
						break;
					}
					
					
					case -277637751:
					{
						if (field.equals("unshift")) 
						{
							__temp_executeDef1 = false;
							this.unshift(((T) (dynargs[0]) ));
						}
						
						break;
					}
					
					
				}
				
			}
			
			if (__temp_executeDef1) 
			{
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		baseArr.push("__a");
		baseArr.push("length");
		super.__hx_getFields(baseArr);
	}
	
	
}


