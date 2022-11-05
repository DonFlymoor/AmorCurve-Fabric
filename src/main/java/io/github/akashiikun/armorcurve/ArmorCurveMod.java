package io.github.akashiikun.armorcurve;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.Toml4jConfigSerializer;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.udojava.evalex.Expression;

public class ArmorCurveMod implements ModInitializer {
	public static CurveConfig config=null;
	public static final Logger LOGGER = LoggerFactory.getLogger("armorcurve");
	public static Expression[]formulae=new Expression[4];

	@Override
	public void onInitialize() {
		AutoConfig.register(CurveConfig.class, Toml4jConfigSerializer::new);
		config=AutoConfig.getConfigHolder(CurveConfig.class).getConfig();
	}
}
