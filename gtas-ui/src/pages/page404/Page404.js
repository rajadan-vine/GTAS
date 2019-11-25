import React from 'react';
import Title from '../../Components/title/Title';
import { Link } from './node_modules/@reach/router';

const Page404 = () => {
return (
    <div className='container'>
      <Title title='404'></Title>

      <div className='columns'>

      <div className='column'>
        <div className='box2'>
          <div className='top'>
            <Link to='/flights'>Flights</Link>
          </div>
        </div>
      </div>
    </div>
  </div>
)

}

export default Page404;