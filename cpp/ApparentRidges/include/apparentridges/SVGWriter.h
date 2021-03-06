// Generated by Haxe 4.1.3
#ifndef INCLUDED_apparentridges_SVGWriter
#define INCLUDED_apparentridges_SVGWriter

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS1(apparentridges,Render)
HX_DECLARE_CLASS1(apparentridges,SVGWriter)

namespace apparentridges{


class HXCPP_CLASS_ATTRIBUTES SVGWriter_obj : public ::hx::Object
{
	public:
		typedef ::hx::Object super;
		typedef SVGWriter_obj OBJ_;
		SVGWriter_obj();

	public:
		enum { _hx_ClassId = 0x48ccdc52 };

		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="apparentridges.SVGWriter")
			{ return ::hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return ::hx::Object::operator new(inSize+extra,false,"apparentridges.SVGWriter"); }

		inline static ::hx::ObjectPtr< SVGWriter_obj > __new() {
			::hx::ObjectPtr< SVGWriter_obj > __this = new SVGWriter_obj();
			__this->__construct();
			return __this;
		}

		inline static ::hx::ObjectPtr< SVGWriter_obj > __alloc(::hx::Ctx *_hx_ctx) {
			SVGWriter_obj *__this = (SVGWriter_obj*)(::hx::Ctx::alloc(_hx_ctx, sizeof(SVGWriter_obj), false, "apparentridges.SVGWriter"));
			*(void **)__this = SVGWriter_obj::_hx_vtable;
			return __this;
		}

		static void * _hx_vtable;
		static Dynamic __CreateEmpty();
		static Dynamic __Create(::hx::DynamicArray inArgs);
		//~SVGWriter_obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, ::hx::PropertyAccess inCallProp);
		static void __register();
		bool _hx_isInstanceOf(int inClassId);
		::String __ToString() const { return HX_("SVGWriter",17,9c,25,d6); }

		static Float rd(Float x);
		static ::Dynamic rd_dyn();

		static ::String lines( ::apparentridges::Render render,::hx::Null< bool >  useOpacity);
		static ::Dynamic lines_dyn();

		static ::String polylines( ::apparentridges::Render render,::hx::Null< bool >  colorful);
		static ::Dynamic polylines_dyn();

		static ::String gradients( ::apparentridges::Render render,::hx::Null< Float >  acc);
		static ::Dynamic gradients_dyn();

};

} // end namespace apparentridges

#endif /* INCLUDED_apparentridges_SVGWriter */ 
