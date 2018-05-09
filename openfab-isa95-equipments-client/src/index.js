import React from 'react';
import ReactDOM from 'react-dom';
import Paper from 'material-ui/Paper';
import {
  DataTypeProvider,
  TreeDataState, SortingState, SelectionState, FilteringState, PagingState,
  CustomTreeData, IntegratedFiltering, IntegratedPaging, IntegratedSorting, IntegratedSelection,
} from '@devexpress/dx-react-grid';
import {
  Grid,
  Table, TableHeaderRow, TableFilterRow, TableTreeColumn,
  PagingPanel, TableColumnResizing, Toolbar, TableColumnVisibility, ColumnChooser,
} from '@devexpress/dx-react-grid-material-ui';

import './index.css';


const getChildRows = (row, rows) => {
  const childRows = rows.filter(r => r.parentID == (row ? row.id : null));
  return childRows.length ? childRows : null;
};

class App extends React.Component {

  constructor (props){
    super(props)
    this.state = {
      rows : [
        {"id":"root","level":"Enterprise"},
        {"id":"area1","parentID":"root","level":"Area"},
        {"id":"area2","parentID":"root","level":"Area"},
        {"id":"processCell1","parentID":"area2","level":"ProcessCell"}
      ],
      columns : [
        {"name":"id", "title":"ID"}, 
        {"name":"level", "title":"hierarchy scope"}
      ]
    }
  }

  render() {

  const {
      rows, columns
    } = this.state;


  return (
      <Paper>
         <Grid
          rows={rows}
          columns={columns}
        >
          <TreeDataState />
          <CustomTreeData
            getChildRows={getChildRows}
          />
          <Table />
          <TableHeaderRow />
          <TableTreeColumn
            for="id"
          />
        </Grid>
      </Paper>
    );
  }
}

// ========================================

ReactDOM.render(
  <App />,
  document.getElementById('root')
);
