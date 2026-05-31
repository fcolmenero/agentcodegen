import express, { Application, Request, Response } from 'express';
import cors from 'cors';

const app: Application = express();

app.use(cors());
app.use(express.json());
app.use(express.static('public'));

app.get('/api/status', (req: Request, res: Response) => {
  res.json({
    status: 'Online',
    timestamp: new Date().toISOString(),
    message: 'Welcome to the Starter Project API'
  });
});

export default app;