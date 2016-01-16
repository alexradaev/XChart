/**
 * Copyright 2015 Knowm Inc. (http://knowm.org) and contributors.
 * Copyright 2011-2015 Xeiam LLC (http://xeiam.com) and contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.knowm.xchart.internal.style;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Stroke;
import java.util.ArrayList;
import java.util.List;

import org.knowm.xchart.ChartColor;
import org.knowm.xchart.SeriesColor;
import org.knowm.xchart.SeriesLineStyle;
import org.knowm.xchart.SeriesMarker;
import org.knowm.xchart.StyleManager.LegendPosition;

/**
 * @author timmolter
 */
public class GGPlot2Theme implements Theme {

  // The color blind friendly palette
  // public static SeriesColor BLACK = new SeriesColor(0, 0, 0, 255);
  // public static SeriesColor ORANGE = new SeriesColor(230, 159, 0, 255);
  // public static SeriesColor SKY_BLUE = new SeriesColor(86, 180, 233, 255);
  // public static SeriesColor BLUISH_GREEN = new SeriesColor(0, 158, 115, 255);
  // public static SeriesColor YELLOW = new SeriesColor(240, 228, 66, 255);
  // public static SeriesColor BLUE = new SeriesColor(0, 114, 178, 255);
  // public static SeriesColor VERMILLION = new SeriesColor(213, 94, 0, 255);
  // public static SeriesColor REDDISH_PURPLE = new SeriesColor(204, 121, 167, 255);

  public static SeriesColor RED = new SeriesColor(248, 118, 109, 255);
  public static SeriesColor YELLOW_GREEN = new SeriesColor(163, 165, 0, 255);
  public static SeriesColor GREEN = new SeriesColor(0, 191, 125, 255);
  public static SeriesColor BLUE = new SeriesColor(0, 176, 246, 255);
  public static SeriesColor PURPLE = new SeriesColor(231, 107, 243, 255);

  // Chart Style ///////////////////////////////

  @Override
  public Color getChartBackgroundColor() {

    return ChartColor.getAWTColor(ChartColor.WHITE);
  }

  @Override
  public Color getChartFontColor() {

    return ChartColor.getAWTColor(ChartColor.BLACK);
  }

  @Override
  public int getChartPadding() {

    return 10;
  }

  @Override
  public SeriesColorMarkerLineStyleCycler getSeriesColorMarkerLineStyleCycler() {

    return new XChartSeriesColorMarkerLineStyleCycler();
  }

  // Chart Title ///////////////////////////////

  @Override
  public Font getChartTitleFont() {

    return new Font(Font.SANS_SERIF, Font.PLAIN, 14);
  }

  @Override
  public boolean isChartTitleVisible() {

    return false;
  }

  @Override
  public boolean isChartTitleBoxVisible() {

    return true;
  }

  @Override
  public Color getChartTitleBoxBackgroundColor() {

    return ChartColor.getAWTColor(ChartColor.GREY);
  }

  @Override
  public Color getChartTitleBoxBorderColor() {

    return ChartColor.getAWTColor(ChartColor.GREY);
  }

  @Override
  public int getChartTitlePadding() {

    return 5;
  }

  // Chart Legend ///////////////////////////////

  @Override
  public Font getLegendFont() {

    return new Font(Font.SANS_SERIF, Font.PLAIN, 14);
  }

  @Override
  public boolean isLegendVisible() {

    return true;
  }

  @Override
  public Color getLegendBackgroundColor() {

    return ChartColor.getAWTColor(ChartColor.WHITE);
  }

  @Override
  public Color getLegendBorderColor() {

    return ChartColor.getAWTColor(ChartColor.WHITE);
  }

  @Override
  public int getLegendPadding() {

    return 10;
  }

  @Override
  public int getLegendSeriesLineLength() {

    return 24;
  }

  @Override
  public LegendPosition getLegendPosition() {

    return LegendPosition.OutsideE;
  }

  // Chart Axes ///////////////////////////////

  @Override
  public boolean isXAxisTitleVisible() {

    return true;
  }

  @Override
  public boolean isYAxisTitleVisible() {

    return true;
  }

  @Override
  public Font getAxisTitleFont() {

    return new Font(Font.SANS_SERIF, Font.PLAIN, 14);
  }

  @Override
  public boolean isXAxisTicksVisible() {

    return true;
  }

  @Override
  public boolean isYAxisTicksVisible() {

    return true;
  }

  @Override
  public Font getAxisTickLabelsFont() {

    return new Font(Font.SANS_SERIF, Font.BOLD, 13);
  }

  @Override
  public int getAxisTickMarkLength() {

    return 8;
  }

  @Override
  public int getAxisTickPadding() {

    return 5;
  }

  @Override
  public boolean isAxisTicksLineVisible() {

    return false;
  }

  @Override
  public boolean isAxisTicksMarksVisible() {

    return true;
  }

  @Override
  public int getPlotPadding() {

    return 0;
  }

  @Override
  public Color getAxisTickMarksColor() {

    return ChartColor.getAWTColor(ChartColor.DARK_GREY);

  }

  @Override
  public Stroke getAxisTickMarksStroke() {

    return new BasicStroke(1.5f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 10.0f, new float[] { 3.0f, 0.0f }, 0.0f);
  }

  @Override
  public Color getAxisTickLabelsColor() {

    return ChartColor.getAWTColor(ChartColor.DARK_GREY);
  }

  @Override
  public int getAxisTitlePadding() {

    return 10;
  }

  @Override
  public int getXAxisTickMarkSpacingHint() {

    return 74;
  }

  @Override
  public int getYAxisTickMarkSpacingHint() {

    return 44;
  }

  // Chart Plot Area ///////////////////////////////

  @Override
  public boolean isPlotGridLinesVisible() {

    return true;
  }

  @Override
  public boolean isPlotGridVerticalLinesVisible() {

    return true;
  }

  @Override
  public boolean isPlotGridHorizontalLinesVisible() {

    return true;
  }

  @Override
  public Color getPlotBackgroundColor() {

    return ChartColor.getAWTColor(ChartColor.LIGHT_GREY);
  }

  @Override
  public Color getPlotBorderColor() {

    return ChartColor.getAWTColor(ChartColor.WHITE);
  }

  @Override
  public boolean isPlotBorderVisible() {

    return false;
  }

  @Override
  public boolean isPlotTicksMarksVisible() {

    return false;
  }

  @Override
  public Color getPlotGridLinesColor() {

    return ChartColor.getAWTColor(ChartColor.WHITE);
  }

  @Override
  public Stroke getPlotGridLinesStroke() {

    return new BasicStroke(1.5f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 10.0f, new float[] { 3.0f, 0.0f }, 0.0f);
  }

  // Bar Charts ///////////////////////////////

  @Override
  public double getBarWidthPercentage() {

    return 0.9;
  }

  @Override
  public boolean isBarsOverlapped() {

    return false;
  }

  @Override
  public boolean isBarFilled() {

    return true;
  }

  // Line, Scatter, Area Charts ///////////////////////////////

  @Override
  public int getMarkerSize() {

    return 8;
  }

  // Error Bars ///////////////////////////////

  @Override
  public Color getErrorBarsColor() {

    return ChartColor.getAWTColor(ChartColor.DARK_GREY);
  }

  @Override
  public boolean isErrorBarsColorSeriesColor() {

    return false;
  }

  public class XChartSeriesColorMarkerLineStyleCycler extends SeriesColorMarkerLineStyleCycler {

    @Override
    public List<SeriesColor> getSeriesColorList() {

      // 1. Color
      List<SeriesColor> seriesColorMap = new ArrayList<SeriesColor>();

      // The color blind friendly palette
      // seriesColorMap.add(BLACK);
      // seriesColorMap.add(ORANGE);
      // seriesColorMap.add(SKY_BLUE);
      // seriesColorMap.add(BLUISH_GREEN);
      // seriesColorMap.add(YELLOW);
      // seriesColorMap.add(BLUE);
      // seriesColorMap.add(VERMILLION);
      // seriesColorMap.add(REDDISH_PURPLE);

      seriesColorMap.add(RED);
      seriesColorMap.add(YELLOW_GREEN);
      seriesColorMap.add(GREEN);
      seriesColorMap.add(BLUE);
      seriesColorMap.add(PURPLE);

      return seriesColorMap;
    }

    @Override
    public List<SeriesMarker> getSeriesMarkerList() {

      // 2. Marker
      List<SeriesMarker> seriesMarkerList = new ArrayList<SeriesMarker>();
      seriesMarkerList.add(SeriesMarker.CIRCLE);
      seriesMarkerList.add(SeriesMarker.DIAMOND);
      return seriesMarkerList;
    }

    @Override
    public List<SeriesLineStyle> getLineStyleList() {

      // 3. Stroke
      List<SeriesLineStyle> seriesLineStyleList = new ArrayList<SeriesLineStyle>();
      seriesLineStyleList.add(SeriesLineStyle.SOLID);
      seriesLineStyleList.add(SeriesLineStyle.DOT_DOT);
      seriesLineStyleList.add(SeriesLineStyle.DASH_DASH);
      return seriesLineStyleList;
    }

  }
}
